import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

 private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);

 private String inputData = null;

 private String[] data;

 private int[] values;

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
  this.values = new int[this.data.length];
  for (int i = 0; i < this.data.length; i++) {
   this.values[i] = Integer.parseInt(this.data[i]);
  }

  Arrays.sort(this.values);

  for (int i = 0; i < this.values.length-1; i++) {
   System.out.print(this.values[i] + " ");
  }
  System.out.println(this.values[this.values-1]);
 }

}