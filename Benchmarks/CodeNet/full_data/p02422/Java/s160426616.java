import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        // fill in the dictionary with the initial value
        String base = f.nextLine();
        int mods = Integer.parseInt(f.nextLine());
        for(int mod = 0; mod < mods; mod++){
            String[] parts = f.nextLine().split(" ");
            String command = parts[0];
            if(command.equals("replace")){
                base = base.substring(0,Integer.parseInt(parts[1])) + parts[3] +  base.substring(Integer.parseInt(parts[2])+1);
            } else if(command.equals("reverse")) {
                String temp = base.substring(Integer.parseInt(parts[1]),Integer.parseInt(parts[2])+1);
                base = base.substring(0,Integer.parseInt(parts[1])) + reverse(temp) +  base.substring(Integer.parseInt(parts[2])+1);
            } else if(command.equals("print")) {
                System.out.println(base.substring(Integer.parseInt(parts[1]),Integer.parseInt(parts[2])+1));
            }
        }
    }
    public static String reverse(String part){
        StringBuilder newStr = new StringBuilder();
        for(int i = part.length()-1; i >= 0; i--){
            newStr.append(String.valueOf(part.charAt(i)));
        }
        return newStr.toString();
    }
}
