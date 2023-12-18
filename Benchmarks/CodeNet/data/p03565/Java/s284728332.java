import java.util.Scanner;

class Main{
        static char wildcard='?';
        static boolean isWild;
        static boolean matches;
        static int ans=-1;
        static String ansString="UNRESTORABLE";

        public static void main(String[] args){
                Scanner scn=new Scanner(System.in);
                String sPrime=scn.next();
                String T=scn.next();
                int sLength=sPrime.length();
                int TLength=T.length();

                int i,j,k;
                for(i=0;i<sLength-TLength+1;i++){
                        for(j=0,k=i;j<TLength;j++,k++){
                                isWild=sPrime.charAt(k)==wildcard;
                                matches=sPrime.charAt(k)==T.charAt(j);
                                if(!isWild && !matches){
                                        break;
                                }
                                if(j==TLength-1){
                                        ans=i;
                                }
                        }
                }

                if(ans!=-1){
                        ansString="";
                        for(i=0;i<ans;i++){
                                isWild=sPrime.charAt(i)==wildcard;
                                if(isWild){
                                        ansString+="a";
                                }else{
                                        ansString+=sPrime.charAt(i);
                                }
                        }
                        ansString+=T;
                        for(i=ans+TLength;i<ans;i++){
                                isWild=sPrime.charAt(i)==wildcard;
                                if(isWild){
                                        ansString+="a";
                                }else{
                                        ansString+=sPrime.charAt(i);
                                }
                        }
                        System.out.println(ansString);
                }else{
                        System.out.println(ansString);
                }
        }
}