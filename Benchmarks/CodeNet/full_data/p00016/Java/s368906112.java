import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

import java.awt.geom.Point2D;

public class Main {

   public static void main(String[] args) throws IOException {
      Writer writer = new Writer();
      Reader reader = new Reader();

      Mover mover = new Mover();
      while (reader.isReadable()) {
         final int distance = reader.readInt(",");
         final int angle = reader.readInt(null);

         if (distance == 0 && angle == 0) {
            final Point2D point = mover.getPoint();
            writer.write((int)point.getX() + "\n");
            writer.write((int)point.getY() + "\n");
            break;
         } else {
            mover.move(distance);
            mover.rotate(angle);
         }
      }

      writer.print();
   }

}

class Mover {

   private Point2D point;
   private int angle;

   private final int ROUND_ANGLE = 360;

   public Mover() {
      this.point = new Point2D.Double(0, 0);
      this.angle = this.ROUND_ANGLE / 4;
   }

   public Point2D getPoint() {
      return this.point;
   }

   public void move(double distance) {
      double angle = Math.toRadians(this.angle);
      double x = this.point.getX() + distance * Math.cos(angle);
      double y = this.point.getY() + distance * Math.sin(angle);
      this.point.setLocation(x, y);
   }

   public void rotate(int angle) {
      this.angle -= angle;
      this.angle %= this.ROUND_ANGLE;
   }

}

// Not important

class Writer {
   private StringBuilder stringBuilder;
   public Writer() {
      this.stringBuilder = new StringBuilder();
   }
   public <T> void write(T text) {
      this.stringBuilder.append(text);
   }
   public void print() {
      System.out.print(stringBuilder);
   }
}   
class Reader {
   private InputStreamReader inputReader;
   private BufferedReader bufferedReader;
   private StringTokenizer tokenizer;
   private String delim;
   public Reader() {
      this.inputReader = new InputStreamReader(System.in);
      this.bufferedReader = new BufferedReader(inputReader);
      this.tokenizer = new StringTokenizer("");
      this.delim = null;
   }
   public void setDelim(String delim) {
      this.delim = delim;
   }
   public boolean isReadable() throws IOException {
      try {
         checkTokenizer();
      } catch (NullPointerException e) {
         return false;
      }   
      return true;
   }
   public Integer readInt() throws IOException {
      final String token = read();
      if (token == null) { return null; }
      return Integer.parseInt(token);
   }
   public Double readDouble() throws IOException {
      final String token = read();
      if (token == null) { return null; }
      return Double.parseDouble(token);
   }
   public String read() throws IOException {
      if (!isReadable()) { return null; }   
      if (delim == null) {
         return this.tokenizer.nextToken();
      } else {
         return this.tokenizer.nextToken(delim);
      }
   }
   public Integer readInt(String delim) throws IOException {
      setDelim(delim);
      return readInt();
   }
   public Double readDouble(String delim) throws IOException {
      setDelim(delim);
      return readDouble();
   }
   public String read(String delim) throws IOException {
      setDelim(delim);
      return read();
   }
   private void checkTokenizer() throws IOException, NullPointerException {
      if (this.tokenizer.hasMoreTokens()) { return; }
      final String line = this.bufferedReader.readLine();
      this.tokenizer = new StringTokenizer(line);
   }
}