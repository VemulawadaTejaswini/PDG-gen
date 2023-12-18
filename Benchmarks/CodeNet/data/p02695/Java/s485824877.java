import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();
		int[] a = new int[Q];
		int[] b = new int[Q];
		int[] c = new int[Q];
		int[] d = new int[Q];
		for(int i = 0; i < Q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		int ans = 0;
		int[] A = new int[N];
		A[0] = 1;
		if(N == 2) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				int temp = 0;
				for(int r = 0; r < Q; r++) {
					if(A[b[r]-1]-A[a[r]-1] == c[r])
						temp += d[r];
				}
				ans = Math.max(ans, temp);
			}
		}
		else if(N == 3) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				for(int j = i; j <= M; j++) {
					A[2] = j;
					int temp = 0;
					for(int r = 0; r < Q; r++) {
						if(A[b[r]-1]-A[a[r]-1] == c[r])
							temp += d[r];
					}
					ans = Math.max(ans, temp);
				}
			}
		}
		else if(N == 4) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				for(int j = i; j <= M; j++) {
					A[2] = j;
					for(int k = j; k <= M; k++) {
						A[3] = k;
						int temp = 0;
						for(int r = 0; r < Q; r++) {
							if(A[b[r]-1]-A[a[r]-1] == c[r])
								temp += d[r];
						}
						ans = Math.max(ans, temp);
					}
				}
			}
		}
		else if(N == 5) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				for(int j = i; j <= M; j++) {
					A[2] = j;
					for(int k = j; k <= M; k++) {
						A[3] = k;
						for(int l = k; l <= M; l++) {
							A[4] = l;
							int temp = 0;
							for(int r = 0; r < Q; r++) {
								if(A[b[r]-1]-A[a[r]-1] == c[r])
									temp += d[r];
							}
							ans = Math.max(ans, temp);
						}
					}
				}
			}
		}
		else if(N == 6) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				for(int j = i; j <= M; j++) {
					A[2] = j;
					for(int k = j; k <= M; k++) {
						A[3] = k;
						for(int l = k; l <= M; l++) {
							A[4] = l;
							for(int m = l; m <= M; m++) {
								A[5] = m;
								int temp = 0;
								for(int r = 0; r < Q; r++) {
									if(A[b[r]-1]-A[a[r]-1] == c[r])
										temp += d[r];
								}
								ans = Math.max(ans, temp);
							}
						}
					}
				}
			}
		}
		else if(N == 7) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				for(int j = i; j <= M; j++) {
					A[2] = j;
					for(int k = j; k <= M; k++) {
						A[3] = k;
						for(int l = k; l <= M; l++) {
							A[4] = l;
							for(int m = l; m <= M; m++) {
								A[5] = m;
								for(int n = m; n <= M; n++) {
									A[6] = n;
									int temp = 0;
									for(int r = 0; r < Q; r++) {
										if(A[b[r]-1]-A[a[r]-1] == c[r])
											temp += d[r];
									}
									ans = Math.max(ans, temp);
								}
							}
						}
					}
				}
			}
		}
		else if(N == 8) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				for(int j = i; j <= M; j++) {
					A[2] = j;
					for(int k = j; k <= M; k++) {
						A[3] = k;
						for(int l = k; l <= M; l++) {
							A[4] = l;
							for(int m = l; m <= M; m++) {
								A[5] = m;
								for(int n = m; n <= M; n++) {
									A[6] = n;
									for(int o = n; o <= M; o++) {
										A[7] = o;
										int temp = 0;
										for(int r = 0; r < Q; r++) {
											if(A[b[r]-1]-A[a[r]-1] == c[r])
												temp += d[r];
										}
										ans = Math.max(ans, temp);
									}
								}
							}
						}
					}
				}
			}
		}
		else if(N == 9) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				for(int j = i; j <= M; j++) {
					A[2] = j;
					for(int k = j; k <= M; k++) {
						A[3] = k;
						for(int l = k; l <= M; l++) {
							A[4] = l;
							for(int m = l; m <= M; m++) {
								A[5] = m;
								for(int n = m; n <= M; n++) {
									A[6] = n;
									for(int o = n; o <= M; o++) {
										A[7] = o;
										for(int p = o; p <= M; p++) {
											A[8] = p;
											int temp = 0;
											for(int r = 0; r < Q; r++) {
												if(A[b[r]-1]-A[a[r]-1] == c[r])
													temp += d[r];
											}
											ans = Math.max(ans, temp);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		else if(N == 10) {
			for(int i = 1; i <= M; i++) {
				A[1] = i;
				for(int j = i; j <= M; j++) {
					A[2] = j;
					for(int k = j; k <= M; k++) {
						A[3] = k;
						for(int l = k; l <= M; l++) {
							A[4] = l;
							for(int m = l; m <= M; m++) {
								A[5] = m;
								for(int n = m; n <= M; n++) {
									A[6] = n;
									for(int o = n; o <= M; o++) {
										A[7] = o;
										for(int p = o; p <= M; p++) {
											A[8] = p;
											for(int q = p; q <= M; q++) {
												A[9] = q;
												int temp = 0;
												for(int r = 0; r < Q; r++) {
													if(A[b[r]-1]-A[a[r]-1] == c[r])
														temp += d[r];
												}
												ans = Math.max(ans, temp);
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
		System.out.println(ans);
	}

}
