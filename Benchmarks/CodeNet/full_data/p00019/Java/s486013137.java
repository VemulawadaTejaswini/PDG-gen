public class Factorial{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int answer = 1;
        while (n != 0){
            answer *= n;
            n--;
        }

        System.out.println(answer);
    }
}