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

             for(int j=i;j<i+3;j++){
                if(a[j]==b[j] ){
                    count++;

            }
            
            }
            

        }if(count>=3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}