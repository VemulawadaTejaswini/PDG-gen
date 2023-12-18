import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfUsers = scanner.nextInt();
        int friendships = scanner.nextInt();
        int blockships = scanner.nextInt();

        int[][] relationshipPlan = new int[numberOfUsers][numberOfUsers];
        int[] answer = new int[numberOfUsers];
        for (int i = 0; i < friendships; i++) {
            int friendshipOne = scanner.nextInt();
            int friendshipTwo = scanner.nextInt();
            relationshipPlan[friendshipOne - 1][friendshipTwo - 1] = 1;
            relationshipPlan[friendshipTwo - 1][friendshipOne - 1] = 1;
        }

        for (int i = 0; i < blockships; i++) {
            int blockshipOne = scanner.nextInt();
            int blockshipTwo = scanner.nextInt();
            relationshipPlan[blockshipOne - 1][blockshipTwo - 1] = -1;
            relationshipPlan[blockshipTwo - 1][blockshipOne - 1] = -1;
        }

        List<List<Integer>> relationships = new ArrayList<>();
        List<List<Integer>> blockedUsers = new ArrayList<>();

        for (int i = 0; i < numberOfUsers; i++) {
            List<Integer> friends = new ArrayList<>();
            List<Integer> blocked = new ArrayList<>();

            for (int k = 0; k < numberOfUsers; k++) {
                if (relationshipPlan[i][k] == 1) {
                    friends.add(k + 1);
                } else if (relationshipPlan[i][k] == -1) {
                    blocked.add(k + 1);
                }
            }
            relationships.add(friends);
            blockedUsers.add(blocked);
        }


        for (int i = 0; i < relationships.size(); i++) {
            List<Integer> relationship = relationships.get(i);
            Set<Integer> candidates = lookForFriends(relationship, relationships);
            int tempAnswer = 0;
            for (Integer candidate : candidates) {
                if (!relationship.contains(candidate) && !blockedUsers.get(i).contains(candidate) && !candidate.equals(i + 1)) {
                    tempAnswer++;
                }
            }
            answer[i] = tempAnswer;
        }


        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfUsers; i++) {
            stringBuilder.append(answer[i] + " ");
        }

        System.out.println(stringBuilder.toString().trim());
    }

    private static Set<Integer> lookForFriends(List<Integer> currentUser, List<List<Integer>> allUsers) {
        UniqueQueue<Integer> toVisit = new UniqueQueue<>();
        toVisit.addAll(currentUser);

        Set<Integer> candidates = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        visited.add(allUsers.indexOf(currentUser) + 1);
        while (!toVisit.isEmpty()) {
            Integer current = toVisit.poll();
            if (current != null) {
                if (!visited.contains(current)) {
                    visited.add(current);
                    List<Integer> friendsOfCurrent = allUsers.get(current - 1);
                    candidates.addAll(friendsOfCurrent);
                    toVisit.addAll(friendsOfCurrent);
                }
            }
        }

        return candidates;
    }

    private static class UniqueQueue<T> implements Queue<T> {

        private final Queue<T> queue = new LinkedList<T>();
        private final Set<T> set = new HashSet<T>();

        @Override
        public boolean add(T t) {
            // Only add element to queue if the set does not contain the specified element.
            if (set.add(t))
                queue.add(t);
            return true; // Must always return true as per API def.
        }

        @Override
        public boolean addAll(Collection<? extends T> arg0) {
            boolean ret = false;
            for (T t : arg0)
                if (set.add(t)) {
                    queue.add(t);
                    ret = true;
                }
            return ret;
        }

        @Override
        public T remove() throws NoSuchElementException {
            T ret = queue.remove();
            set.remove(ret);
            return ret;
        }

        @Override
        public boolean remove(Object arg0) {
            boolean ret = queue.remove(arg0);
            set.remove(arg0);
            return ret;
        }

        @Override
        public boolean removeAll(Collection<?> arg0) {
            boolean ret = queue.removeAll(arg0);
            set.removeAll(arg0);
            return ret;
        }

        @Override
        public void clear() {
            set.clear();
            queue.clear();
        }

        @Override
        public boolean contains(Object arg0) {
            return set.contains(arg0);
        }

        @Override
        public boolean containsAll(Collection<?> arg0) {
            return set.containsAll(arg0);
        }

        @Override
        public boolean isEmpty() {
            return queue.isEmpty();
        }

        @Override
        public Iterator<T> iterator() {
            return queue.iterator();
        }

        @Override
        public boolean retainAll(Collection<?> arg0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int size() {
            return queue.size();
        }

        @Override
        public Object[] toArray() {
            return queue.toArray();
        }

        @Override
        public <T> T[] toArray(T[] arg0) {
            return queue.toArray(arg0);
        }

        @Override
        public T element() {
            return queue.element();
        }

        @Override
        public boolean offer(T e) {
            return queue.offer(e);
        }

        @Override
        public T peek() {
            return queue.peek();
        }

        @Override
        public T poll() {
            return queue.poll();
        }
    }
}
