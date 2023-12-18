import java.util.*;
public class Main{
public static void main(String[] args){
Scanner x= new Scanner(System.in);

String y = x.next();
char[] z = new char[y.length()];
int c=0;
for(int i=0;i<y.length();i++){
if(y.charAt(i)=='B'){
    if(c!=0){
    z[c] =0;
    c--;
    }
}else{
    z[c] = y.charAt(i);
    c++;
    }
}
System.out.println(Arrays.toString(z));

}
}