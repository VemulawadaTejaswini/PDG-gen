import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String t, p;
        p = scanner.next();
        int counter = 0;

        while(true){
            t = scanner.next();
            if(t.equals("END_OF_TEXT")) break;

            if(t.equalsIgnoreCase(p)){
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
