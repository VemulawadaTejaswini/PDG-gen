import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String S = sc.nextLine();
        long K = sc.nextLong();
        int notone=-1;
        int notoneindex=-1;
        int[] arr=new int[100];
        for(int i=0;i<S.length();i++){
            arr[i]=S.charAt(i)-'0';
        }
        for(int i=0;i<S.length();i++){
            if(arr[i]!=1){
                notone=arr[i];
                notoneindex=i;
                break;
            }
        }
        if(notone==-1){
            System.out.println("1");
        }else if(K<=notoneindex){
            System.out.println("1");
        }else{
            System.out.println(notone);
        }
    }
}
