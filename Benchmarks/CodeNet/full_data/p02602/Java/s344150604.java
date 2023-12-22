import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int k=sc.nextInt();int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int plus=0;int count=0;
        while (count<n-k){
            int first_group = 0; int second_group =0;
            for(int i=0;i<k;i++){
                first_group+=array[i+plus];
                second_group+=array[i+plus+1];
            }
            plus++;
            if(second_group-first_group>0) {
                System.out.println("Yes");
                count++;
            }
            else{
                System.out.println("No");
                count++;
            }

        }
    }
}