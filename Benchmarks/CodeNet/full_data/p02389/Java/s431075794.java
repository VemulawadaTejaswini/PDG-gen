import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);
 private String inputData = null;
 
 private String[] data;

 private int x;
 private int y;

 private int field_00001;
 private int field_00002;

 public static void main(String args[]) {
  new Main().start();
 }

 public void start() {
  try {
  this.inputData = reader.readLine();
  } catch(IOException e) {
   e.printStackTrace();
  }

  this.data = this.inputData.split(" ");
  this.x = Integer.parseInt(this.data[0]);
  this.y = Integer.parseInt(this.data[1]);

  this.field_00001 = this.x * this.y;
  this.field_00002 = this.x * 2 + this.y * 2;
  System.out.println(this.field_00001 + " " + this.field_00002);
 }

}