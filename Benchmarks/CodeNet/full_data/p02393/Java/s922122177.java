import java.util.Scanner;

public class Main {
public static void main(String[] args) {
int i, j, tmp;
int[] a = { 0, 0, 0 };
Scanner s = new Scanner(System.in);

for (i = 0; i < 3; i++)
a[i]=s.nextInt();
for (i = 0; i < 2; i++)
for (j = i + 1; j < 3; j++)
if (a[i] > a[j]) {
tmp = a[i];
a[i] = a[j];
a[j] = tmp;
}


System.out.println(a[0]+" "+a[1]+ " "+a[2]);
}

}import java.util.Scanner;

public class Main {
public static void main(String[] args) {
int i, j, tmp;
int[] a = { 0, 0, 0 };
Scanner s = new Scanner(System.in);

for (i = 0; i < 3; i++)
a[i]=s.nextInt();
for (i = 0; i < 2; i++)
for (j = i + 1; j < 3; j++)
if (a[i] > a[j]) {
tmp = a[i];
a[i] = a[j];
a[j] = tmp;
}


System.out.println(a[0]+" "+a[1]+ " "+a[2]);
}

}


