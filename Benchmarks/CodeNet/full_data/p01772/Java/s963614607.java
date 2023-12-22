import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();
		for(int i = 0; i < in.length; i++) {
			if(in[i] != 'A' && in[i] != 'Z') {
				in[i] = 0;
			}
		}
		boolean nowA = true;
		for(int i = 0; i < in.length; i++) {
			if(in[i] == 0) continue;
			if(nowA && in[i] == 'Z') {
				in[i] = 0;
				continue;
			}
			if(!nowA && in[i] == 'A') {
				in[i] = 0;
				continue;
			}
			if(in[i] == 'A') {
				nowA = false;
			}
			if(in[i] == 'Z') {
				nowA = true;
			}
		}
		for(int i = in.length-1; i >= 0; i--) {
			if(in[i] == 0) continue;
			if(in[i] == 'A') {
				in[i] = 0;
				break;
			}
			if(in[i] == 'Z') {
				break;
			}
		}
		boolean check = false;
		for(int i = 0; i < in.length; i++) {
			if(in[i] == 'A') {
				check = true;
				break;
			}
		}
		
		if(check) 
			for(int i = 0; i < in.length; i++) {
				if(in[i] != 0)
				System.out.print(in[i]);
			}
		else
			System.out.print(-1);
		System.out.println();
		
		
	}
}