import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x, max=0, min=0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            x = scanner.nextInt();
            if(i == 0){
                max = x;
                min = x;
            }
            else{
                if(max < x)max = x;
                if(min > x)min = x;
            }
            sum += x;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}

