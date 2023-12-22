import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

 private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);

 private String inputData = null;

 private String[] data;

 private int left;

 private int center;

 private int right;

 public static void main(String args[]) {
  new Main().start();
 }

 public void start() {
  try {
   this.inputData = reader.readLine();
  } catch (IOException e) {
   e.printStackTrace();
  }

  this.data = this.inputData.split(" ");

  this.left = Integer.parseInt(this.data[0]);
  this.center = Integer.parseInt(this.data[1]);
  this.right = Integer.parseInt(this.data[2]);

  if (this.left < this.center &&
  this.center < this.right &&
  this.left < this.right) {
   System.out.println("Yes");
  } else {
   System.out.println("No");
  }

 }

}