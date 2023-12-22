import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int[] array;
       array=new int[n];

       for(int i=0;i<n;i++){
    	   array[i]=sc.nextInt();
       }
       for(int i=n-1;i>=0;i--){
    	   if(i==0){System.out.println(array[i]);
       }else{
    	   System.out.print(array[i]+" ");
       }

        //System.out.println();
    }
}
}

