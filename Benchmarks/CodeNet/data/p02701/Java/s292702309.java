import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String s;
        String[] array;
        array[] = new String[N];
        int count = 0; 

        for(int i = 0; i <= N; i++){
            s = scanner.next();
            array[i] = s;
            count += 1;
            for(int o = 0; o < array.length; o++){
                if(array[i] == s){
                    count -= 1;
                }
            }
        }

        System.out.println(count);
    }
}