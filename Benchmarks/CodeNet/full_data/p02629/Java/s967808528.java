import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        final long dec = stdIn.nextLong();
        final String base36 = Long.toString(dec, 26);
        char[] work = new char[base36.length()];
        String output = "";
        for(int i = 0; i < base36.length(); i++){
            work[i] = base36.charAt(i);
        }
        
        for(int i = 0; i < base36.length(); i++){
            if(work[i] < 0x3a){
                
                if(i != base36.length() - 1){
                    if(work[i + 1] == '0'){
                        if(work[i] == '1'){
                            System.out.print("z");
                            i++;
                        }else{
                            System.out.print(Character.toChars(work[i] + 0x2f));
                            System.out.print("z");
                            i++;
                        }
                    }else{
                        System.out.print(Character.toChars(work[i] + 0x30));
                    }
                }else{
                    System.out.print(Character.toChars(work[i] + 0x30));
                }
                
            }else{
                if(i != base36.length() - 1){
                    if(work[i + 1] == '0'){
                        if(work[i] == '1'){
                            System.out.print("z");
                            i++;
                        }else{
                            System.out.print(Character.toChars(work[i] + 0x08));
                            System.out.print("z");
                            i++;
                        }
                    }else{
                        System.out.print(Character.toChars(work[i] + 0x09));
                    }
                }else{
                    System.out.print(Character.toChars(work[i] + 0x09));
                }
                
            }
        }
        System.out.println();
        //for(int i = 0; i < base36.length(); i++){
        //    System.out.print(work[i]);
        //}
    }
}
