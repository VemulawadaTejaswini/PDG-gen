import java.util.Scanner;

int count = 0;
int H;
int A;

Scanner scanner = new Scanner(System.in);
H = scanner.next();
A = scanner.next();

while (H>0){
  H = H-A;
  count = count + 1;
}

System.out.println(count);
