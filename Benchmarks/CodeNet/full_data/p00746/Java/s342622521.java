import java.util.*;

class Main {
public static void main(String args[]) {
new Main().run();
}

Scanner in = new Scanner(System.in);
int[] vx = {-1, 0, 1, 0};
int[] vy = {0, 1, 0, -1};

public void run() {
while (true) {
int n = in.nextInt();
if (n == 0) break;
int[] x = new int[n];
int[] y = new int[n];

x[0] = y[0] = 0;

int minX = 0, minY = 0, maxX = 0, maxY = 0;

for (int i = 0; i < n - 1; i++) {
int c = in.nextInt(), d = in.nextInt();
x[i+1] = x[c] + vx[d];
minX = Math.min(minX, x[i+1]);
maxX = Math.max(maxX, x[i+1]);
y[i+1] = y[c] + vy[d];
minY = Math.min(minY, y[i+1]);
maxY = Math.max(maxY, y[i+1]);
}

System.out.println((maxX - minX + 1) * (maxY - minY + 1));
}
}
}