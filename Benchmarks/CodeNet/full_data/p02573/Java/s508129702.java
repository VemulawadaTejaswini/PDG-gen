import java.awt.Event;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new TestA().doIt();
//		new TestB().doIt();
//		new TestC().doIt();
		new TestD().doIt();
	}
	class TestD{
		void doIt() {
			int N = sc.nextInt();
			int M = sc.nextInt();
			UnionFind uf = new UnionFind(N);
			for(int i = 0;i < M;i++) {
				int A = sc.nextInt() - 1;
				int B = sc.nextInt() - 1;
				uf.unionSet(A, B);
			}
			int MAX = 0;
			System.out.println(uf.maxSizeSet());
		}
		class UnionFind{
			int[] p, rank, setSize;
			int numSets,maxSize;
			
			public UnionFind(int N) {
				p = new int[numSets = N];
				rank = new int[N];
				setSize = new int[N];
				for(int i = 0;i < N;i++) {
					p[i] = i;
					setSize[i] = 1;
				}
			}
			
			int findSet(int i) {
				return p[i] == i ? i : (p[i] = findSet(p[i]));
			}
			
			boolean isSameSet(int i,int j) {
				return findSet(i) == findSet(j);
			}
			
			void unionSet(int i,int j) {
				if(isSameSet(i, j))return;
				numSets--;
				int x = findSet(i), y = findSet(j);
				if(rank[x] > rank[y]) {
					p[y] = x;
					setSize[x] += setSize[y];
					maxSize = Math.max(setSize[x],maxSize);
				}else {
					p[x] = y;
					setSize[y] += setSize[x];
					maxSize = Math.max(setSize[y],maxSize);
					if(rank[x] == rank[y])rank[y]++;
				}
			}
			
			int maxSizeSet() {
				return maxSize;
			}
			
			int numDisjoinSets() {
				return numSets;
			}
			
			int sizeOfSet(int i) {
				return setSize[findSet(i)];
			}
		}
	}
}