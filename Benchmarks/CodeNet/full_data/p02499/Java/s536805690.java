import java.util.*;



 
class Main {
    public static void main(String[] args){
        int a[];
        a=new int[100];
        int n=0;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
     
        
        for(int i=0;i<word.length();i++){
            a[Character.getNumericValue(word.charAt(i))-10]++;
        }
        for(int j=0;j<26;j++){
            System.out.printf("%c : %d\n",(char)(j)+'a',a[j]);

        }

    }
}

    