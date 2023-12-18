public class Solution{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int x = nextInt();
int flag = 0;
for(int i=x; i<2*x; i++){
for(int j=2; j/x<x; j++){
if(i%j == 0){
flag = 0;
break;
}
else{
flag = 1;
}
}
if(flag == 1)
break;
}
}
System.out.print(i);
}
}