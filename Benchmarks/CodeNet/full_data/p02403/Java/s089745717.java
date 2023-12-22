import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);

while (true) {
int h = inp.nextInt();
int w = inp.nextInt();

if (h==0&&w==0) break;

for (int i = 0; i<=h; h++){
for (int j = 0; j<=w; w++){
System.out.print("#");
}
System.out.println();
}
}
}
}
