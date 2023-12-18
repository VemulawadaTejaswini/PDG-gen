import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Integer>[] sets = new TreeSet[26];
        for(int i=0; i<26; i++) {
            sets[i] = new TreeSet<>();
        }

        char[] s = sc.next().toCharArray();
        int[] c = new int[n];
        for(int i=0; i<n; i++) {
            c[i] = s[i]-'a';
            sets[c[i]].add(i);
        }

        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            int com = sc.nextInt();
            if(com == 1) {
                int ind = sc.nextInt()-1;
                int num = sc.next().charAt(0) - 'a';
                if(c[ind] != num) {
                    sets[c[ind]].remove(ind);
                    sets[num].add(ind);
                    c[ind] = num;
                }
            } else {
                int l = sc.nextInt()-1;
                int r = sc.nextInt()-1;
                int sum = 0;
                for(int j=0; j<26; j++) {
                    Integer h = sets[j].higher(l-1);
                    if(h != null && h<=r) sum++;
                }
                System.out.println(sum);

            }

        }

    }

}