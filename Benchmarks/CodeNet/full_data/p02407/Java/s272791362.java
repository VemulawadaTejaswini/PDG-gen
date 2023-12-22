import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int  j = Integer.parseInt(sc.nextLine());
        
        int box[] = new int[j];
        
        for(int i=1; i<=j;i++){
            box[j-i]=sc.nextInt();
        }
        for(int i=0; i<j; i++){
            if(i<j-1){
                System.out.print(box[i]+ " ");
            }else{
                System.out.println(box[i]);
            }
        }
        
        
    }
}

