import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        String T=scanner.next();
        int q=scanner.nextInt();
        List<char[]> missMatchList=new ArrayList<>();
        for(int i=0;i<q;i++){
            if(isConclude(T,scanner.next(),missMatchList)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
    public static boolean isConclude(String original, String part,List<char[]> list){
        char[] originalChars=original.toCharArray();
        char[] partChars=part.toCharArray();
        return isConclude(originalChars,partChars,list);
    }
    public static boolean isConclude(char[] original, char[] part,List<char[]> list){
        for(int i=0;i<=original.length-part.length;i++){
            if(part[0]==original[i]){
                if(isMatch(original,part,i,list)){
                    return true;
                }else{
                    continue;
                }
            }
        }
        return false;
    }
    public static boolean isMatch(char[] original, char[] part,int index,List<char[]> list){
        if(list!=null){
            for(char[] missCase:list){
                if(part.length>missCase.length){
                    if(isMatch(part,missCase,0,null)){
                        return false;
                    }
                }
            }
        }
        for(int i=0;i<part.length;i++){
            if(original[index+i]!=part[i]){
                list.add(Arrays.copyOfRange(part,0,i+1));
                return false;
            }
        }
        return true;
    }
}

