import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main{ 
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
String str =sc.next();
int size=str.length();
int ans=0;
for(int i=0;i<size-2;i++){
    for(int j=i+3;j<=size;j++){
        if(isMultiple(str.substring(i,j),10,2019)){
        ans++;
    }
}
    }

System.out.print(ans);
}
static boolean isMultiple (String s, int base, int m) {
	int temp = 0;
	for (int i=0; i<s.length(); i++) {
		temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
	}
	if (temp==0) {
        System.out.println(s);
        return true;}
	return false;
}


}
