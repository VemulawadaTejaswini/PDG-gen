import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
long N = sc.nextInt();
long m = 0;
long a = 0;
long r = 0;
long c = 0;
long h = 0;

String name;
for(int i = 0;i<N;i++){
name = sc.next();
if(name.startsWith("M")){
m++;
}else if(name.startsWith("A")){
a++;
}else if(name.startsWith("R")){
r++;
}else if(name.startsWith("C")){
c++;
}else if(name.startsWith("H")){
h++;
}
}
long ans;
ans = m*a*r+m*a*c+m*a*h+m*r*c+m*r*h+m*c*h+a*r*c+a*r*h+a*c*h+r*c*h;
              System.out.println(ans);
    }
}