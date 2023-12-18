import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i=0; i<n; i++) str[i] = sc.next();
        Arrays.sort(str);
        char ch[][] = new char[n][10];
        for (int i=0; i<n; i++){
            ch[i] = str[i].toCharArray();
        }
//        char s[][] = new char[n][10];
//        for (int i=0; i<n; i++) s[i] = sc.next().toCharArray();

//        Arrays.sort(s, (a, b) -> Character.compare(a[0], b[0]));
//        for (int i=0; i<n; i++) Arrays.sort(s[i]);
        int count = 1;

        List<Integer> li = new ArrayList<>();

        for (int i=0; i<n-1; i++){
            count = 1;
            for (int j=i+1; j<n; j++){
                if (comp(ch[i], ch[j])){
                    count++;

                }else{
                    li.add(count);
                    i += j;
                    continue;
                }
            }
        }
        int sum = 0;
        for (int i=0; i<li.size(); i++){
            sum += li.get(i) * (li.get(i)-1) /2;
        }

        System.out.print(sum);
//        System.out.print(ch[1][5]);
    }
    public static boolean comp(char[] c1, char []c2){

        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)){
            return true;
        }else{
            return false;
        }
    }


}