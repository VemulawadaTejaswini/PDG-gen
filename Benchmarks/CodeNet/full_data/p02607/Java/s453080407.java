import java.util.Scanner;

public class Main {
    public int odd(int []a){
        int count=0;
        for (int i = 0; i < a.length; i++) {int b=0;
            b=i+1;
            if (b%2!=0&&a[i]%2!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        Main obj=new Main();
        while (tan.hasNext()){
            int n=tan.nextInt();
            int []a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=tan.nextInt();
            }
            int result=obj.odd(a);
            System.out.println(result);
        }
    }
}
