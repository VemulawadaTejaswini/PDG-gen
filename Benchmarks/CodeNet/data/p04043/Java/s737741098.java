import java.util.*;

public class Main{

public static void main(String[] args){

Scanner x = new Scanner(System.in);

int num=x.nextInt();
int length=x.nextInt();

String[] arr = new String[num];

for(int i = 0;i<num;i++){
arr[i]=x.next();
}
Collections.sort(arr);
String result="";
for(int i = 0;i<num;i++){
result += arr[i];
}

return result;
}

}