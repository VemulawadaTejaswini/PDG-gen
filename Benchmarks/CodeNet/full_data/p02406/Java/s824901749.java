import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;

public class Main {
    int i;
    int n;
    int x;
    String result;
    StringBuilder writeBuilder;
    StringWriter stringWriter;
    BufferedWriter bufferedWriter;
    public Main(){
        this.n = 0;
        this.i = 1;
        this.x = 0;
        this.result = "";
        this.writeBuilder = new StringBuilder();
        this.stringWriter = new StringWriter();
        this.bufferedWriter = new BufferedWriter(this.stringWriter);
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ITP1_5_D problem = new Main();
        problem.call(n);
    }

    public void call(int n) throws IOException {
        
        this.n = n;
        checkNum();
        this.writeBuilder.append("\n");
        this.result += "\n";
        System.out.println(this.writeBuilder);
       // bufferedWriter.(this.writeBuilder.toString());   //does not display
    }

    public void checkNum() throws IOException {
        x = i;
        if (x % 3 == 0) {
            this.writeBuilder.append(" ");
            this.writeBuilder.append(String.valueOf(i));
            result += " " + i;
            endCheckNum();
        }
        include3();
    }

    public void include3() throws IOException {
        if (x % 10 == 3 && i <= n) {
            this.writeBuilder.append(" ");
            this.writeBuilder.append(String.valueOf(i));
            this.result += " " + i;
            endCheckNum();
        }
        x /= 10;
        if (x != 0) {
            include3();
        }
        endCheckNum();

    }

    public void endCheckNum() {
        if (++i <= n) {
            checkNum();
        }
    }
}

