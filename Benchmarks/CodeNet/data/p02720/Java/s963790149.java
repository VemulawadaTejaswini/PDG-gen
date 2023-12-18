import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			List<Long> list = new ArrayList<>();
			for(int i = 0 ; i <= 9 ; i++) {
				if(i != 0) {
					list.add((long)i);
				}
				for(int j = 0 ; j <= 9 ; j++) {
					if(Math.abs(i - j) <= 1) {
						if(j != 0) {
							list.add(Long.parseLong(String.valueOf(j) + String.valueOf(i)));
						}
						for(int l = 0 ; l <= 9 ; l++) {
							if(Math.abs(j - l) <= 1) {
								if(l != 0) {
									list.add(Long.parseLong(String.valueOf(l) + String.valueOf(j) + String.valueOf(i)));
								}
								for(int m = 0 ; m <= 9 ; m++) {
									if(Math.abs(l - m) <= 1) {
										if(m != 0) {
											list.add(Long.parseLong(String.valueOf(m) + String.valueOf(l) + String.valueOf(j) + String.valueOf(i)));
										}
										for(int n = 0 ; n <= 9 ; n++) {
											if(Math.abs(m - n) <= 1) {
												if(n != 0) {
													list.add(Long.parseLong(String.valueOf(n) + String.valueOf(m) + String.valueOf(l) + String.valueOf(j) + String.valueOf(i)));
												}
												for(int o = 0 ; o <= 9 ; o++) {
													if(Math.abs(n - o) <= 1) {
														if(o != 0) {
															list.add(Long.parseLong(String.valueOf(o) + String.valueOf(n) + String.valueOf(m) + String.valueOf(l) + String.valueOf(j) + String.valueOf(i)));
														}
														for(int p = 0 ; p <= 9 ; p++) {
															if(Math.abs(o - p) <= 1) {
																if(p != 0) {
																	list.add(Long.parseLong(String.valueOf(p) + String.valueOf(o) + String.valueOf(n) + String.valueOf(m) + String.valueOf(l) + String.valueOf(j) + String.valueOf(i)));
																}
																for(int q = 0 ; q <= 9 ; q++) {
																	if(Math.abs(p - q) <= 1) {
																		if(q != 0) {
																			list.add(Long.parseLong(String.valueOf(q) + String.valueOf(p) + String.valueOf(o) + String.valueOf(n) + String.valueOf(m) + String.valueOf(l) + String.valueOf(j) + String.valueOf(i)));
																		}
																		for(int r = 0 ; r <= 9 ; r++) {
																			if(Math.abs(q - r) <= 1) {
																				if(r != 0) {
																					list.add(Long.parseLong(String.valueOf(r) + String.valueOf(q) + String.valueOf(p) + String.valueOf(o) + String.valueOf(n) + String.valueOf(m) + String.valueOf(l) + String.valueOf(j) + String.valueOf(i)));
																				}
																				for(int s = 0 ; s <= 9 ; s++) {
																					if(Math.abs(r - s) <= 1) {
																						if(s != 0) {
																							list.add(Long.parseLong(String.valueOf(s) + String.valueOf(r) + String.valueOf(q) + String.valueOf(p) + String.valueOf(o) + String.valueOf(n) + String.valueOf(m) + String.valueOf(l) + String.valueOf(j) + String.valueOf(i)));
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			Collections.sort(list);
			System.out.println(list.get(k - 1));
		}

	}

}
