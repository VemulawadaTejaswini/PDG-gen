import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] inputs = scan.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int x = Integer.parseInt(inputs[1]);
        int num = 0;
        int k;

        for (int i=1; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                for (int k=j+1; k<n+1; k++){
                    if (i+j+k == x){
                        num += 1;
                        break;
                    }
                }
            }
        }
        if (num != 0){
            System.out.println(num);
        }
    }
}