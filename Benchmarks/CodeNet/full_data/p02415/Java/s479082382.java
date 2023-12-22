import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        conversionChar(str);
    }
    
    static void conversionChar(String str){
        List<String> charList = new ArrayList<String>();
        for(int i = 0; i<str.length(); i++){
            charList.add(str.substring(i,i+1));
            if(Character.isUpperCase(str.charAt(i))){
                charList.set(i, str.substring(i,i+1).toLowerCase());
            }else if(!Character.isUpperCase(str.charAt(i))){
                charList.set(i, str.substring(i,i+1).toUpperCase());
            }
        }
        for(String resultChar : charList){
            System.out.print(resultChar);
        }
        System.out.println("");
    }
}
