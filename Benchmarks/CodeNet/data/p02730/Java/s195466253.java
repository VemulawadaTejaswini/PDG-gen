

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        StringBuilder stringBuilder1=new StringBuilder();
        StringBuilder stringBuilder2=new StringBuilder();
        for(int j=0;j<(str.length()-1)/2;j++){
            stringBuilder1.append(str.charAt(j));
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(int j=((str.length()-1)/2)+1;j<str.length();j++){
            stringBuilder2.append(str.charAt(j));
            stringBuilder.append(str.charAt(j));
        }
//        StringBuilder stringBuilder=stringBuilder2;
        StringBuilder ss=stringBuilder2.reverse();
        //stringBuilder2=stringBuilder2.reverse();
//        System.out.println(ss.toString());
//        System.out.println(stringBuilder.toString());
        if(stringBuilder1.toString().equals(ss.toString())){
            int ff=0;
            for(int j=0;j<stringBuilder1.length();j++){
                if(stringBuilder1.charAt(j)!=stringBuilder1.charAt(stringBuilder1.length()-1-j)){
                    ff=1;
                    break;
                }
            }
            for(int j=0;j<stringBuilder.length();j++){
                if(stringBuilder.charAt(j)!=stringBuilder.charAt(stringBuilder.length()-1-j)){
                    ff=1;
                    break;
                }
            }
            if(ff==1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }


        }
        else{
//            System.out.println(stringBuilder1.toString());
//            System.out.println(stringBuilder2.toString());
            System.out.println("No");
        }


    }

}
