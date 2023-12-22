import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            String command = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String c = "";
            if(command.equals("replace")){
                c = sc.next();
            }

            if(command.equals("print")){
                System.out.println(target.substring(a, b));
            }else if(command.equals("reverse")){
                char[] charArray = target.substring(a, b).toCharArray();
                String str = "";
                for(int j = charArray.length - 1; j >= 0; j--){
                    str += charArray[j];
                }
                target = target.substring(0, a) + str + target.substring(b);
            }else if(command.equals("replace")){
                target = target.substring(0, a) + c + target.substring(b);
            }
        }
    }
}
