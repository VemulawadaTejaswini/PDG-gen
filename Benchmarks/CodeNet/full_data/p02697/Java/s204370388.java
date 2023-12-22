import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = n/2;
        int count = 0;
        for(int i = 0; i < m; i++){
            System.out.println((start+count) + " " + (start+count+1));
            count++;
            start++;
        }
    }
}

