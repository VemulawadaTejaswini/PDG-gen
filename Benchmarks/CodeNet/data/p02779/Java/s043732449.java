import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];

        for(int i=0;i<n;i++)a[i]=sc.nextInt();

        Arrays.sort(a);

        String ans = "YES";
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                ans="NO";
                break;
            }
        }
        System.out.println(ans);
    }

}


