import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
long N=scan.nextLong();
int k=0;

for(int i=1;i<12;i++) {
if(26*(Math.pow(26,i-1)-1)/25<N&&N<=26*(Math.pow(26,i)-1)/25){k=i;}
}

for(int i=1;i<k;i++){N=N-(long)Math.pow(26,i);}
String M=Long.toString(N-1,26);
int U=k-M.length();
for(int i=0;i<U;i++){M="0"+M;}

        String p="";;

for(int i=0;i<k;i++){
    if(M.substring(i,i+1).equals("0")){p=p+"a";}
    if(M.substring(i,i+1).equals("1")){p=p+"b";}
    if(M.substring(i,i+1).equals("2")){p=p+"c";}
    if(M.substring(i,i+1).equals("3")){p=p+"d";}
    if(M.substring(i,i+1).equals("4")){p=p+"e";}
    if(M.substring(i,i+1).equals("5")){p=p+"f";}
    if(M.substring(i,i+1).equals("6")){p=p+"g";}
    if(M.substring(i,i+1).equals("7")){p=p+"h";}
    if(M.substring(i,i+1).equals("8")){p=p+"i";}
    if(M.substring(i,i+1).equals("9")){p=p+"j";}
    if(M.substring(i,i+1).equals("a")){p=p+"k";}
    if(M.substring(i,i+1).equals("b")){p=p+"l";}
    if(M.substring(i,i+1).equals("c")){p=p+"m";}
    if(M.substring(i,i+1).equals("d")){p=p+"n";}
    if(M.substring(i,i+1).equals("e")){p=p+"o";}
    if(M.substring(i,i+1).equals("f")){p=p+"p";}
    if(M.substring(i,i+1).equals("g")){p=p+"q";}
    if(M.substring(i,i+1).equals("h")){p=p+"r";}
    if(M.substring(i,i+1).equals("i")){p=p+"s";}
    if(M.substring(i,i+1).equals("j")){p=p+"t";}
    if(M.substring(i,i+1).equals("k")){p=p+"u";}
    if(M.substring(i,i+1).equals("l")){p=p+"v";}
    if(M.substring(i,i+1).equals("m")){p=p+"w";}
    if(M.substring(i,i+1).equals("n")){p=p+"x";}
    if(M.substring(i,i+1).equals("o")){p=p+"y";}
    if(M.substring(i,i+1).equals("p")){p=p+"z";}


}
System.out.println(p);
    }
    }

