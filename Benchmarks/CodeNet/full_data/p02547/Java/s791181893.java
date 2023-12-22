import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        int[] a = new int[t];
        int[] b = new int[t];
        
        for(int i=0;i<t;i++){
             a[i] = sc.nextInt();
             b[i]  = sc.nextInt();
            
            }
            for(int j=i;j<i+3;j++){
                if(a[i]==b[i] && a[i]>=1 && a[i]<=6 && b[i]>=1 && b[i]<=6 ){
                    count++;

            }

        }if(count>=3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}