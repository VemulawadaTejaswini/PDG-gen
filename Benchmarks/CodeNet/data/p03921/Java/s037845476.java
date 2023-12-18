
import java.util.*;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {
    static class Person {
        int id;
        int[] langs;
        Person(int id, int[] langs) {
            this.id = id;
            this.langs = langs;
        }
    }

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        List<Person> langPersonMap[] = new List[M];
        Arrays.fill(langPersonMap, new ArrayList());
        Person people[] = new Person[N];
        for(int i = 0; i < N; i++) {
            String[] ls = scanner.nextLine().split(" ");
            int length = Integer.parseInt(ls[0]);
            int[] langs = new int[length];
            for(int j = 0; j < length; j++) {
                langs[j] = Integer.parseInt(ls[j + 1]) - 1;
            }
            Person p = new Person(i, langs);
            people[i] = p;
            for(int l: langs) {
                langPersonMap[l].add(p);
            }
        }

        boolean visitedPeople[] = new boolean[N];
        boolean visitedLangs[] = new boolean[M];

        Stack<Person> visitingPeople = new Stack<>();

        visitingPeople.push(people[0]);
        visitedPeople[0] = true;
        int count = 0;
        while(visitingPeople.size() > 0 && count != N) {
            Person p1 = visitingPeople.pop();
            count += 1;
            System.out.println("id: " + p1.id);
            int[] langs = p1.langs;
            for(int l: langs) {
                if(visitedLangs[l] == false) {
                    visitedLangs[l] = true;
                    List<Person> ps = langPersonMap[l];
                    for(Person p2: ps) {
                        if(visitedPeople[p2.id] == false) {
                            visitedPeople[p2.id] = true;
                            visitingPeople.push(p2);
                        }
                    }
                }
            }
        }

        if(count == N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}