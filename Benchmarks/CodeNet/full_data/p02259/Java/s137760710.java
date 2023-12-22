import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        String[] input = sc.nextLine().split(" ");
        
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(input[i]);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1; j++){
                if(input[j] > input[j+1]){
                    int tmp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = tmp;
                    count++;
                }
            }
        }
        for(int in: input){
            System.out.print(in+" ");
        }
        
    }
}
