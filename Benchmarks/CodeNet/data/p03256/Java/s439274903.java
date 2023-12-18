import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();

        char[] S = new char[N];
        String line = sc.nextLine();
        for (int i = 0; i < N; i++) {
            S[i] = line.charAt(i);
        }

        boolean[] isConnectedToA = new boolean[N];
        boolean[] isConnectedToB = new boolean[N];


        ArrayList<ArrayList<Integer>> connected = new ArrayList<ArrayList<Integer>>(N);
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> elem = new ArrayList<>();
            connected.add(elem);
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            connected.get(a).add(b);
            connected.get(b).add(a);

            if (S[a] == 'A') {
                isConnectedToA[b] = true;
            } else {
                isConnectedToB[b] = true;
            }

            if (S[b] == 'A') {
                isConnectedToA[a] = true;
            } else {
                isConnectedToB[a] = true;
            }
        }

        Set<Integer> unsearchedNodes = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unsearchedNodes.add(i);
        }

        while (!unsearchedNodes.isEmpty()) {
            int nowNode = unsearchedNodes.iterator().next();
            unsearchedNodes.remove(nowNode);

            for (int node : connected.get(nowNode)) {
                if (S[node] == 'A') {
                    for (int nextNode : connected.get(node)) {
                        if (!isConnectedToB[nextNode]) {
                            break;
                        }
                    }
                } else {
                    for (int nextNode : connected.get(node)) {
                        if (!isConnectedToA[nextNode]) {
                            break;
                        }
                    }
                }
            }
            }

            Set<Integer> visitedThisIterationNodes = new HashSet<>();
            visitedThisIterationNodes.add(nowNode);

            Queue<Integer> queue = new LinkedList<>();
            queue.add(nowNode);

            while (!queue.isEmpty()) {
                int node = queue.poll();

                if (S[node] == 'A') {
                    for (int nextNode : connected.get(node)) {
                        if (isConnectedToB[nextNode]) {
                            if (visitedThisIterationNodes.contains(nextNode)) {
                                System.out.println("Yes");
                                return;
                            }

                            queue.add(nextNode);
                            visitedThisIterationNodes.add(nextNode);
                            unsearchedNodes.remove(nextNode);
                        } else {
                            if (unsearchedNodes.contains(nextNode)) unsearchedNodes.remove(nextNode);
                        }
                    }
                } else {
                    for (int nextNode : connected.get(node)) {
                        if (isConnectedToA[nextNode]) {
                            if (visitedThisIterationNodes.contains(nextNode)) {
                                System.out.println("Yes");
                                return;
                            }

                            queue.add(nextNode);
                            visitedThisIterationNodes.add(nextNode);
                            unsearchedNodes.remove(nextNode);
                        } else {
                            if (unsearchedNodes.contains(nextNode)) unsearchedNodes.remove(nextNode);
                        }
                    }
                }
            }

            visitedThisIterationNodes.clear();
        }

        System.out.println("No");
    }
}