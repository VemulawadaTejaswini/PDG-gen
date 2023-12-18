import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int x;
        int index = 1;
        while(true){
            x = scanner.nextInt();
            if(x == 1)break;
            index++;
        }

        int counter = 0;
        int index_sub = index;
        while(true){
            counter++;
            index_sub -= k-1;
            if(index_sub <= 1) break;
        }
        index_sub = index;
        while(true){
            counter++;
            index_sub += k-1;
            if(index_sub >= n)break;
        }
        System.out.println(counter);
    }
}