import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        Map<Long, List<Person>> map = new HashMap<>();

        long count = 0;
        for (long id = 1; id <= n; id++) {
            long height = scanner.nextLong();
            Person person = new Person(id, height);
            if (!map.containsKey(person.calc())) {
                map.put(person.calc(), new ArrayList<>());
            }
            map.get(person.calc()).add(person);

            long target = id - person.height;
            if (map.containsKey(target)) {
                count += map.get(target).size();
            }
        }
        System.out.println(count);
    }

    static class Person {
        long id;
        long height;

        public Person(long id, long height) {
            this.id = id;
            this.height = height;
        }

        public long calc() {
            return this.id + this.height;
        }

        @Override
        public String toString() {
            return id + ":" + height;
        }
    }
}