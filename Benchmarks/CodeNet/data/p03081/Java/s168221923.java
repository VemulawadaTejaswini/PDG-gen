import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        String s = sc.next();
        boolean[] bl = new boolean[q];
        int[] c = new int[q];
        for(int i = 0; i < q; i++){
            c[i] = sc.next().charAt(0) - 'A';
            bl[i] = sc.next().equals("L") ?false:true;
        }
        int ans = 0;
        int last1 = s.charAt(0) - 'A';
        int index1 = 0;
        int last2 = s.charAt(n-1) - 'A';
        int index2 = n-1;
        for(int i = q-1; i>=0; i--){
            if(c[i] == last1 && bl[i] == false){
                ans++;
                index1++;
                last1 = s.charAt(index1)- 'A';
            }
            if(c[i] == last2 && bl[i] == true){
                ans++;
                index2--;
                last2 = s.charAt(index2) - 'A';
            }
        }
        System.out.println(Math.max(0,n - ans));
    }
}