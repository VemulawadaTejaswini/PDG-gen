import java.util.*;
//import java.util.Arrays;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
//        List<Integer> a = new ArrayList<>();

        int ball[] = new int[n];

        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        int half =0;
        if (n%2==0) half=n/2+1;
        else half=n/2;

        for (int i=half-1; i<n; i++){
            if (a[i]==0){
                ball[i] = 0;
            }else{
                ball[i] = 1;
            }
        }



        for (int i=half-2; i>=0; i--){
            long sum = 0;
            for (int j=i*2; j<n; j+=i){
//                long sum = 0;
                sum += ball[j];
            }if (sum%2==a[i]){
                ball[i] = 0;
            }else {
                ball[i] = 1;
            }
        }

        for (int i=0; i<n; i++){
            if (!Arrays.asList(ball).contains(1)){
                System.out.println(0);
            }
        }

        List<Integer> ans = new ArrayList<>();
        int count = 0;
        for (int i=0; i<n; i++){
            if (ball[i]==1){
                count++;
                ans.add(i);
            }
        }
        if (Arrays.asList(ball).contains(1)){
            System.out.println(count);
            for (int i=0; i<ans.size(); i++){
                System.out.println(ans.get(i));
            }
        }

    }
}
