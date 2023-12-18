import java.util.*;

public class Main{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
//
        String str1 = scan.next();
        String str2 = scan.next();
        if(str1.length() != str2.length()){
            System.out.println("No");
            return;
        }
        if(str1.length() == 1){
            if(str1.equals(str2)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }            
            return;
        }
//
        String[] strArry1 = new String[str1.length()];
        String[] strArry2 = new String[str2.length()];
//
        setArray(strArry1, str1);
        setArray(strArry2, str2);
//
        String[] wstrArry = new String[str1.length()];
            for (int i = 0; i < strArry1.length; i++){
                cnvArry(wstrArry,strArry1);
                if(comp(wstrArry,strArry2) == 0){
                    System.out.println("Yes");
                    return;
                }
            }            
            System.out.println("No");
            return;
    }
/*
    split strings
*/
    public static void setArray(String[] array, String str){
        for (int i = 0; i < array.length; i++){
            array[i] = String.valueOf(str.charAt(i));
        }
    }
/*
    compare strings
*/
    public static int comp(String[] wstrArry, String[] strArry2){
        for (int i = 0; i < wstrArry.length; i++){
            if(wstrArry[i].equals(strArry2[i])){
                continue;
            }else{                
                return 1;
            }
        }
        return 0;        
    }
/*
    convert
*/
    public static void cnvArry(String[] wstrArry, String[] strArry1){
        wstrArry[0] = strArry1[strArry1.length - 1];
        for (int j = 0; j < strArry1.length-1; j++){
            wstrArry[j+1] = strArry1[j];
        }
//
        for (int k = 0; k < strArry1.length; k++){
            strArry1[k] = wstrArry[k];
        }
    }
}

