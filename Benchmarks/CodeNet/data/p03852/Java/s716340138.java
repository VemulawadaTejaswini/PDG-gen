import java.io.*;
public class Main{
    public static void main(String[] args){
        try{
        char name = (char)System.in.read();
        if(name == 'a' || name == 'e' || name == 'i' ||
                name == 'o' || name == 'u'){
            System.out.println("vowel");
                }
        else{
            System.out.println("consonant");
        }
        }
        catch(IOException e){
            System.out.println("error");
        }
    }
}
