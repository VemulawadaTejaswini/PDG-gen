import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.xml.crypto.Data;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder[] sb = new StringBuilder[101];
		for(int i = 0; i < sb.length; i++) {
			sb[i] = new StringBuilder();
		}
		int len = 0;
		while(true) {
			String in = sc.nextLine();
			if(in.equals("END_OF_TEXT")) break;
			sb[len++].append(in);
		}
		boolean LF = false;
		StringBuilder buffer = new StringBuilder();
		int ci = 0;
		int cj = 0;
		while(true) {
			String in = sc.nextLine();
			if(in.equals("-")) break;
			if(in.equals("a")) {
				cj = 0;
				break;
			}
			if(in.equals("e")) {
				cj = sb[ci].length();
				break;
			}
			if(in.equals("p")) {
				if(ci != 0) {
					ci--;
				}
				cj = 0;	
				break;
			}
			if(in.equals("n")) {
				if(ci+1 != len) {
					ci++;
				}
				cj = 0;
				break;
			}
			if(in.equals("f")) {
				if(cj != sb[ci].length()) {
					cj++;
				}
				else {
					if(ci+1 != len) {
						ci++;
						cj = 0;
					}
				}
			}
			if(in.equals("b")) {
				if(cj != 0) {
					cj--;
				}
				else {
					if(ci != 0) {
						ci--;
						cj = sb[ci].length();
					}
				}
			}
			if(in.equals("d")) {
				if(cj != sb[ci].length()) {
					sb[ci].deleteCharAt(cj);
				}
				else {
					if(ci+1 != len) {
						sb[ci].append(sb[ci+1]);
						ci++;
						while(ci+1 != len) {
							sb[ci] = sb[ci+1];
							ci++;
						}
						len--;
					}
				}
			}
			if(in.equals("k")) {
				if(cj == sb[ci].length()) {
					if(ci+1 != len) {
						sb[ci].append(sb[ci+1]);
						ci++;
						while(ci+1 != len) {
							sb[ci] = sb[ci+1];
							ci++;
						}
						len--;
					}
					buffer = new StringBuilder();
					LF = true;
				}
				else {
					buffer = new StringBuilder(sb[ci].substring(cj, sb[ci].length()));
					sb[ci].delete(cj, sb[ci].length());
					cj = sb[ci].length();
					LF = false;
				}
			}
			if(in.equals("y")) {
				if(LF) {
					int now = len;
					while(now != ci) {
						sb[now] = sb[now-1];
						now--;
					}
					len++;
					sb[ci+1] = new StringBuilder(sb[ci].substring(cj,sb[ci].length()));
					sb[ci].delete(cj, sb[ci].length());
					ci++;
				}
				else {
					if(cj == sb[ci].length()) {
						sb[ci].insert(cj, buffer);
						cj = sb[ci].length();
					}
					else {
						sb[ci].insert(cj, buffer);
						cj += buffer.length();
					}
				}
			}
		}
		for(int i = 0; i < len; i++) {
			System.out.println(sb[i].toString());
		}
		
		
	}
}