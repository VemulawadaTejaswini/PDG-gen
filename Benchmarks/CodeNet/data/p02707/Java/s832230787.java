import java.util.*;
public class Main{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n+1];
        Arrays.fill(a,0);

        for(int i=0;i<n-1;i++){
            a[sc.nextInt()]++;

        }


        System.out.println(a[1]);
        for(int i=1,j=0;(i<n && j<n-1);i++,j++){
            if(a[i]>1){
          //      System.out.println("i ="+i+" j="+j);
            //    System.out.println("a[i+1]"+a[i+1]);
                System.out.println(a[i+1]);
                a[i]--;
            //    System.out.println("a[i] ="+a[i]);
                i--;



            }
            else{

          //     System.out.println("i ="+i+" j="+j);
            //    System.out.println("a[i+1]"+a[i+1]);
               System.out.println(a[i+1]);
                //System.out.println("a[i] ="+a[i]);

            }


        }



    }
}
