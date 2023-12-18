import java.util.*;
import static java.lang.System.*;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
char Alpha[] = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"];
int N = sc.nextInt();
String S = sc.next();
String ans ="";
for(int i=0;i<(S.length);i++){
	for(int j=0;j<28;j++){
    if((S.charAt(i)).equals(Alpha[j])){
    ans = ans+Alpha[j+N];
    }
	}
out.println(ans);
}

}
}
