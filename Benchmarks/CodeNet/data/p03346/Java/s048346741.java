/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for (int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    int search = 1;
    int[] loLens = new int[n];
    int[] maxLoToMoveArr = new int[n];
    int maxLoToMove = 0;
    int maxVal = 0;
    int loLen = 0;
    for (int i=0; i<n; i++) {
      if (arr[i]==search) {
        loLen++;
        search++;
      }
      if (arr[i]>maxVal) {
        maxVal = arr[i];
      }
      if (i>0 && arr[i]<maxVal && arr[i]>maxLoToMove) {
        maxLoToMove = arr[i];
      }
      loLens[i] = loLen;
      maxLoToMoveArr[i] = maxLoToMove;
    }
    search = n;
    int hiLen = 0;
    int[] minHiToMoveArr = new int[n];
    int[] hiLens = new int[n];
    int minVal = n+1;
    int minHiToMove = n+1;
    for (int i=n-1; i>=0; i--) {
      if (arr[i]==search) {
        search--;
        hiLen++;
      }
      if (arr[i]<minVal) {
        minVal = arr[i];
      }
      if (i<n-1 && arr[i]>minVal && arr[i]<minHiToMove) {
        minHiToMove = arr[i];
      }
      hiLens[i] = hiLen;
      minHiToMoveArr[i] = minHiToMove;
    }
    int best = n - (Math.max(hiLen,loLen));
    int maxSeen = 0;
    for (int i=0; i<n; i++) {
      if (arr[i]>maxSeen) {
        maxSeen = arr[i];
      }
      if (maxSeen==i+1) {
        int left = maxLoToMoveArr[i];
        int right = minHiToMoveArr[i];
        if (left+right<best) {
          best = left+right;
        }
      }
    }
    System.out.println(best);
  }
}
